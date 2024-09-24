class BankAccount(deposited : Long, withdrawn : Long){

    var deposited : Long = deposited
    var withdrawn : Long = withdrawn
    var balance : Long = this.deposited - this.withdrawn

    }


// write the BankAccount class here


fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)

}