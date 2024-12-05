package e6;

import java.util.Random;

/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2804a extends AbstractC2806c {
    @Override // e6.AbstractC2806c
    public int b() {
        return d().nextInt();
    }

    @Override // e6.AbstractC2806c
    public int c(int i8) {
        return d().nextInt(i8);
    }

    public abstract Random d();
}
