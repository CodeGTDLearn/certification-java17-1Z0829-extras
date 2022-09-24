package extras.sealed_class.interfaces;

sealed interface Sealed_Int2
     extends   Sealed_Int1,   Simple_Int   permits NonSealed_Int {
}