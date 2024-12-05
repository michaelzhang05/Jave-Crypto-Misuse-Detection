package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: BrittleContainsOptimization.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0000\u001a,\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"convertToSetForSetOperation", HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/util/Collection;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/sequences/Sequence;", "convertToSetForSetOperationWith", "source", "safeToConvertToSet", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class p {
    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List y0;
        l.f(iterable, "<this>");
        l.f(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
                return (Collection) iterable;
            }
            Collection<T> collection = (Collection) iterable;
            return b(collection) ? b0.w0(iterable) : collection;
        }
        if (CollectionSystemProperties.f22053b) {
            return b0.w0(iterable);
        }
        y0 = b0.y0(iterable);
        return y0;
    }

    private static final <T> boolean b(Collection<? extends T> collection) {
        return CollectionSystemProperties.f22053b && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
