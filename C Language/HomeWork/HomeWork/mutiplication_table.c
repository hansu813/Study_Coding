#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	int a = 0, i=0, j=0;
	printf("원하는 구구단을 입력해주세요. >> ");
	scanf("%d", &a);

 	for (i = 1; i <= 9; i++) {
		printf("%d X %d = %d\n", a, i, a*i);
	}
	printf("==============================\n");

	return 0;
}