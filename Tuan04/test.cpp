#include <bits/stdc++.h>
using namespace std;

void input(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
}

void sort(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (arr[i] > arr[j])
            {
                swap(arr[i], arr[j]);
            }
        }
    }
}

bool check(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > 2022)
        {
            return true;
        }
    }
    return false;
}

int sum(int arr[], int n)
{
    int sum = 0, count = 0;
    sort(arr, n);
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > 2022)
            count++;    
    }

    if (check(arr, n) == true)
    {
        for (int i = 0; i < n - count; i++)
        {
            sum += arr[i];
        }
    }
    else
    {
        for (int i = 0; i <= n; i++)
        {
            sum += arr[i];
        }
    }
    return sum;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    input(arr, n);
    cout << sum(arr, n);
    cout << endl;
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}
