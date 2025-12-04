#include <stdio.h>

int main()
{
    int size = 0;
    long long int array[1000000];
    long long int max, min;

    scanf("%d", &size);

    for (int i = 0; i < size; i++) {
        scanf("%lld", &array[i]);
    }

    min = max = array[0];

    for (int i = 1; i < size; i++) {
        if (array[i] < min) min = array[i];
        if (array[i] > max) max = array[i];
    }

    printf("%lld %lld\n", min, max);
    return 0;
}