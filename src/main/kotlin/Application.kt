import kotlin.random.Random

fun main(){
    val answer = setComputer()
    println("Computer : ${answer.joinToString()}")
}

//��ǻ�Ͱ� 1���� 9���� ���� �ٸ� ������ �� 3�� ����
fun setComputer() : IntArray{
    val answer = mutableListOf<Int>()
    while (answer.size < 3){
        answer.add(Random.nextInt(1, 10))
    }
    return answer.toIntArray()
}

