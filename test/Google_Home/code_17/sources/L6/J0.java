package l6;

import q6.AbstractC3879n;

/* loaded from: classes5.dex */
public abstract class J0 extends I {
    public abstract J0 E();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String F() {
        J0 j02;
        J0 c8 = C3347b0.c();
        if (this == c8) {
            return "Dispatchers.Main";
        }
        try {
            j02 = c8.E();
        } catch (UnsupportedOperationException unused) {
            j02 = null;
        }
        if (this != j02) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // l6.I
    public I limitedParallelism(int i8) {
        AbstractC3879n.a(i8);
        return this;
    }
}
