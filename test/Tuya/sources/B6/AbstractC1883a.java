package b6;

import java.util.Random;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1883a extends AbstractC1885c {
    @Override // b6.AbstractC1885c
    public int b() {
        return d().nextInt();
    }

    @Override // b6.AbstractC1885c
    public int c(int i8) {
        return d().nextInt(i8);
    }

    public abstract Random d();
}
