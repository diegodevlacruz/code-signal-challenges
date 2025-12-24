package com.diegodelacruz.codesignal.concurrency.syncontrol;

public class Warehouse {
    private int itemCount = 0;
    private int totalValue = 0;

    // Existing method to add items to inventory
    public synchronized void addItem(int value) {
        itemCount++;
        totalValue += value;
    }

    // TODO: Add a new method `updateInventory` that takes two arguments, `items`
    // (int) and `valuePerItem` (int).
    // Use a synchronized block to ensure only one thread can modify `itemCount` and
    // `totalValue` at a time.
    // The method should update `itemCount` by adding the `items` and update
    // `totalValue` by adding `items * valuePerItem`.
    protected void updateInventory(int items, int valuePerItem) {
        synchronized (this) {
            itemCount += items;
            totalValue += items * valuePerItem;
        }
    }

    public int getItemCount() {
        synchronized (this) {
            return itemCount;
        }
    }

    // TODO: Add a synchronized block to safely return the total value
    protected int getTotalValue() {
        synchronized (this) {
            return totalValue;
        }
    }
}