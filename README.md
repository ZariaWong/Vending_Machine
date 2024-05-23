# Vending_Machine

Consider a vending machine that sells soft drinks and accept coins only. The vending machine allows customers to insert coins, reject inserted coins and purchase a product. We build a system to simulate the operations of a vending machine. 


A typical vending machine consists of 4 basic components:
• A Coin Slot allows customers to insert coins into the machine. It also serves as temporality storage for inserted coins and accumulates the amount of face values.
• A button to reject all inserted coins.
• A Coin Changer stores coins to give change. Change is the money that is returned to the customer who has paid for the product that costs less than the amount that the customer has paid. You can assume that there is an infinite supply of coins in the coin changer.
• A component that contains multiple columns. Each column holds the same soft drink. When a transaction is made, a can of drink is dropped into the dispenser.


The procedure for selling a soft drink by the vending machine is as follows:
1. The customer inserts coins into the Coin Slot.
2. The customer selects a product.
3. If the customer has inserted enough credits (enough amount of money) for the product, the vending machine first drops the product and returns the change (if necessary). Then, all coins in the Coin Slot are collected.
