package kotlin.coroutines.j.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: DebugMetadata.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0002\u001a\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\bH\u0001¢\u0006\u0002\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\bH\u0001¢\u0006\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"COROUTINES_DEBUG_METADATA_VERSION", HttpUrl.FRAGMENT_ENCODE_SET, "checkDebugMetadataVersion", HttpUrl.FRAGMENT_ENCODE_SET, "expected", "actual", "getDebugMetadataAnnotation", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "getLabel", "getSpilledVariableFieldMapping", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getStackTraceElementImpl", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    private static final void a(int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
    }

    private static final DebugMetadata b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    private static final int c(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(BaseContinuationImpl baseContinuationImpl) {
        String str;
        l.f(baseContinuationImpl, "<this>");
        DebugMetadata b2 = b(baseContinuationImpl);
        if (b2 == null) {
            return null;
        }
        a(1, b2.v());
        int c2 = c(baseContinuationImpl);
        int i2 = c2 < 0 ? -1 : b2.l()[c2];
        String b3 = ModuleNameRetriever.a.b(baseContinuationImpl);
        if (b3 == null) {
            str = b2.c();
        } else {
            str = b3 + '/' + b2.c();
        }
        return new StackTraceElement(str, b2.m(), b2.f(), i2);
    }
}
