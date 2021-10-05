#include <stdio.h>
int n;
int WB[2] = { 0, }; // 0 : white, 1: blue
char Paper[129][129] = { 0, }; // idx: 1 ~ 128

int check(int ltr, int ltc, int rbr, int rbc) {
	// return 1 : need to divide
	int cnt[2] = { 0, }; // 0 : white, 1: blue
	for (int i = ltr; i <= rbr; i++) {
		for (int j = ltc; j <= rbc; j++) {
			cnt[Paper[i][j] - '0']++;
			if (cnt[0] > 0 && cnt[1] > 0)
				return 1; // different color
		}
	}

	// same color
	if (cnt[0] > 0)
		WB[0]++;
	else
		WB[1]++;

	return 0;
}

// left-top-row, left-top-col, right-botton-row, right-botton-col
void divide(int ltr, int ltc, int rbr, int rbc) {
	int offset = (rbr - ltr + 1) / 2;
	if (offset == 1) {
		for (int i = ltr; i <= rbr; i++) {
			for (int j = ltc; j <= rbc; j++) {
				WB[Paper[i][j] - '0']++;
			}
		}
	}
	else {
		if (check(ltr, ltc, ltr + offset - 1, ltc + offset - 1))
			divide(ltr, ltc, ltr + offset - 1, ltc + offset - 1);

		if (check(ltr, ltc + offset, ltr + offset - 1, rbc))
			divide(ltr, ltc + offset, ltr + offset - 1, rbc);

		if (check(ltr + offset, ltc, rbr, ltc + offset - 1))
			divide(ltr + offset, ltc, rbr, ltc + offset - 1);

		if (check(ltr + offset, ltc + offset, rbr, rbc))
			divide(ltr + offset, ltc + offset, rbr, rbc);
	}
}

int main(void) {
	int cnt[2] = { 0, }; // 0 : white, 1: blue
	char trash;
	
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			scanf(" %c", &Paper[i][j]);
			cnt[Paper[i][j] - '0']++;
		}
	}


	if (cnt[0] > 0 && cnt[1] > 0) {
		divide(1, 1, n, n);
		printf("%d\n%d\n", WB[0], WB[1]);
	}
	else {
		if (cnt[0] > 0)
			WB[0] = 1;
		else
			WB[1] = 1;
		printf("%d\n%d\n", WB[0], WB[1]);
	}

	return 0;
}