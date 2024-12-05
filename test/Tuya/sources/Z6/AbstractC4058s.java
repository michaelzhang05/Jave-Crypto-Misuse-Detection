package z6;

import kotlin.jvm.internal.AbstractC3159y;
import y6.AbstractC3999a;

/* renamed from: z6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4058s {
    public static final C4048h a(InterfaceC4061v sb, AbstractC3999a json) {
        AbstractC3159y.i(sb, "sb");
        AbstractC3159y.i(json, "json");
        if (json.d().k()) {
            return new r(sb, json);
        }
        return new C4048h(sb);
    }
}
