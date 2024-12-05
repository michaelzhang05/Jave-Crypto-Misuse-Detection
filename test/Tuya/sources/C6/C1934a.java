package c6;

import b6.AbstractC1883a;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1934a extends AbstractC1883a {
    @Override // b6.AbstractC1883a
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC3159y.h(current, "current(...)");
        return current;
    }
}
