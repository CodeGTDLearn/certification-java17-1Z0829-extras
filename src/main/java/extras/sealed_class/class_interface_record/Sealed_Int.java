package extras.sealed_class.class_interface_record;

sealed interface Sealed_Int
     permits NonSealed_Int,   NonSealed_Class,   Final_Implic_Record {
}