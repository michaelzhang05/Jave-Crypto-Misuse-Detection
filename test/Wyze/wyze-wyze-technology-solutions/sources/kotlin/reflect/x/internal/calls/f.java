package kotlin.reflect.x.internal.calls;

import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: Caller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001c\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"arity", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/reflect/jvm/internal/calls/Caller;", "getArity", "(Lkotlin/reflect/jvm/internal/calls/Caller;)I", "kotlin-reflection"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    public static final int a(Caller<?> caller) {
        l.f(caller, "<this>");
        return caller.a().size();
    }
}
