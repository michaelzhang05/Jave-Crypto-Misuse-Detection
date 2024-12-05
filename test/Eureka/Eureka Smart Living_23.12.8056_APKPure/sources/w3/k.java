package w3;

import v1.n;

/* loaded from: classes.dex */
public abstract class k extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    public k() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        n.e(str, "Detail message must not be empty");
    }
}
