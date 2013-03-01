#include <stdio.h>
#include <stdarg.h>

int print(int ints, ...) {
	int n = ints;
	va_list args;
	va_start(args, ints);
	int i = 0;
	while (i < n) {
		printf("%d", va_arg(args, int));
		i++;
	}
	va_end(args);
	printf("\n");
	return 0;
}

int main() {
	print(1, 1);
	print(1, 2);
	print(2, 3, 4);
	return 0;
}
