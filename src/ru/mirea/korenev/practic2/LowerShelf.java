package ru.mirea.korenev.practic2;

public class LowerShelf {
    private Book [] arr;
    private int size;

    public LowerShelf(Book[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }
    public Book Max_year(){
        double max = arr[0].getData();
        int maxind = 0;
        for(int i = 1; i<size; i++){
            if(arr[i].getData() >= max){
                max = arr[i].getData();
                maxind =i;
            }
        }
        return arr[maxind];
    }

    public Book Min_year() {
        double min = arr[0].getData();
        int minind = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i].getData() <= min) {
                min = arr[i].getData();
                minind = i;
            }
        }
        return arr[minind];
    }
}
