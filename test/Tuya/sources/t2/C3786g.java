package t2;

import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: t2.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3786g extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3786g(String type) {
        super("Serialization result " + type + " is not supported");
        AbstractC3159y.i(type, "type");
    }
}
