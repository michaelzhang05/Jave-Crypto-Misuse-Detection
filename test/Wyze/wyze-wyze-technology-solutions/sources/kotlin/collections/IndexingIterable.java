package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Iterables.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/IndexingIterable;", "T", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.w.h0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {

    /* renamed from: f, reason: collision with root package name */
    private final Function0<Iterator<T>> f22045f;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterable(Function0<? extends Iterator<? extends T>> function0) {
        l.f(function0, "iteratorFactory");
        this.f22045f = function0;
    }

    @Override // java.lang.Iterable
    public Iterator<IndexedValue<T>> iterator() {
        return new IndexingIterator(this.f22045f.invoke());
    }
}
