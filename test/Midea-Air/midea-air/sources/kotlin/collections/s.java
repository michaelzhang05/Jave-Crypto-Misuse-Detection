package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0080\b\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0001\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00020\t2\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u001d\u0010\n\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0081\b\u001a\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0081\b\u001a\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0081\b¢\u0006\u0002\u0010\u0017\u001a4\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0013\"\u0004\b\u0000\u0010\u00182\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0013H\u0081\b¢\u0006\u0002\u0010\u001a\u001a\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006\"\u0004\b\u0000\u0010\u0004H\u0001\u001a\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006\"\u0004\b\u0000\u0010\u00042\u0006\u0010\b\u001a\u00020\tH\u0001\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001d\u001a\u0002H\u0018¢\u0006\u0002\u0010\u001e\u001a1\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\b\u0000\u0010\u0018*\n\u0012\u0006\b\u0001\u0012\u0002H\u00180\u00132\u0006\u0010 \u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010!\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180#H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180#2\u0006\u0010$\u001a\u00020%H\u0007\u001a\u001f\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0003\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180'H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"brittleContainsOptimizationEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "build", HttpUrl.FRAGMENT_ENCODE_SET, "E", "builder", HttpUrl.FRAGMENT_ENCODE_SET, "buildListInternal", "capacity", HttpUrl.FRAGMENT_ENCODE_SET, "builderAction", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "checkCountOverflow", "count", "checkIndexOverflow", "index", "copyToArrayImpl", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "collection", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "createListBuilder", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "shuffled", HttpUrl.FRAGMENT_ENCODE_SET, "random", "Ljava/util/Random;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class s {
    public static <E> List<E> a(List<E> list) {
        l.f(list, "builder");
        return ((ListBuilder) list).K();
    }

    public static final <T> Object[] b(T[] tArr, boolean z) {
        l.f(tArr, "<this>");
        if (z && l.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        l.e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new ListBuilder();
    }

    public static <E> List<E> d(int i2) {
        return new ListBuilder(i2);
    }

    public static <T> List<T> e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        l.e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
