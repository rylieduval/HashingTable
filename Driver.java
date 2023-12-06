package pack;

public class Driver {

	public static void main(String[] args) {
		HashTable_Chaining hash = new HashTable_Chaining(10);
		HashTable_LinearProbe hash1 = new HashTable_LinearProbe(10);
		//chaining Table
		System.out.println("Chaining Table:");
		hash.HashInsert(10, 10);
		hash.HashInsert(20, 20);
		hash.HashInsert(11, 11);
		hash.HashInsert(22, 22);
		hash.HashInsert(34, 34);
		hash.HashInsert(17, 17);
		hash.HashInsert(89, 89);
		hash.HashInsert(43, 43);
		hash.HashInsert(12, 12);
		hash.HashInsert(91, 91);
		hash.HashInsert(77, 77);
		hash.HashInsert(29, 29);
		hash.HashInsert(66, 66);
		hash.HashInsert(74, 74);
		hash.HashInsert(86, 86);
		hash.HashInsert(23, 23);
		hash.HashInsert(45, 45);
		hash.HashInsert(80, 80);
		hash.HashInsert(17, 17);
		hash.HashInsert(55, 55);
		
		System.out.println(hash);
		
		//linear probe Table 
		System.out.println("Linear Probing Table:");
		hash1.HashInsert(10, 10);
		hash1.HashInsert(20, 20);
		hash1.HashInsert(34, 34);
		hash1.HashInsert(17, 17);
		hash1.HashInsert(89, 89);
		hash1.HashInsert(43, 43);
		hash1.HashInsert(12, 12);
		hash1.HashInsert(91, 91);
		hash1.HashInsert(77, 77);
		hash1.HashInsert(29, 29);
		
		System.out.println(hash1);
		//search for one in the table (returns true)
		System.out.println(hash1.HashSearch(17));
		//search for one not in the table (returns false)
		System.out.println(hash1.HashSearch(99));
		//delete the 17 value from table
		hash1.HashDelete(17);
		//reprint table after deleted key 
		System.out.println(hash1);
	}

}