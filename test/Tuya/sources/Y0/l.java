package y0;

import R.AbstractC1319p;

/* loaded from: classes3.dex */
public abstract class l extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    public l() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(str);
        AbstractC1319p.g(str, "Detail message must not be empty");
    }
}
