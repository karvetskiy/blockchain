package vsevolod.karvetskiy

class BlocksGenerator {
    private val genericHash: String = "0"

    val block1: Block = Block("James", "Ann", 1000, genericHash)
    val block2: Block = Block("James", "Ann", 1000, block1.hash)
    val block3: Block = Block("James", "Ann", 1000, block2.hash)
    val block4: Block = Block("James", "Ann", 1000, block3.hash)
    val block5: Block = Block("James", "Ann", 1000, block4.hash)
    val block6: Block = Block("James", "Ann", 1000, block5.hash)
    val block7: Block = Block("James", "Ann", 1000, block6.hash)
    val block8: Block = Block("James", "Ann", 1000, block7.hash)
    val block9: Block = Block("James", "Ann", 1000, block8.hash)
    val block10: Block = Block("James", "101", 1000, block9.hash)
    val block11: Block = Block("James", "Ann", 1000, block10.hash)
    val block12: Block = Block("James", "Ann", 1000, block11.hash)
    val block13: Block = Block("James", "Ann", 1000, block12.hash)
    val block14: Block = Block("James", "Ann", 1000, block13.hash)
    val block15: Block = Block("James", "Ann", 1000, block14.hash)
    val block16: Block = Block("James", "Ann", 1000, block15.hash)
    val block17: Block = Block("James", "Ann", 1000, block16.hash)
    val block18: Block = Block("James", "Ann", 1000, block17.hash)
    val block19: Block = Block("James", "Ann", 1000, block18.hash)
    val block20: Block = Block("James", "Ann", 1000, block19.hash)
    val block21: Block = Block("James", "Ann", 1000, block20.hash)
    val block22: Block = Block("James", "Ann", 1000, block21.hash)
    val block23: Block = Block("James", "Ann", 1000, block22.hash)
    val block24: Block = Block("James", "Ann", 1000, block23.hash)
    val block25: Block = Block("James", "Ann", 1000, block24.hash)
}