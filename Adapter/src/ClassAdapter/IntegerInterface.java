package ClassAdapter;

interface IntegerValueInterface {
    public int getInteger();
}

class IntegerValue implements IntegerValueInterface {
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue {
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapter {
    private IntegerValueInterface myInt;

    public ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}