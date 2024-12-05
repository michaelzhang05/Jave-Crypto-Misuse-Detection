package w2;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: w2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4140g extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140g(String type) {
        super("Serialization result " + type + " is not supported");
        AbstractC3255y.i(type, "type");
    }
}
