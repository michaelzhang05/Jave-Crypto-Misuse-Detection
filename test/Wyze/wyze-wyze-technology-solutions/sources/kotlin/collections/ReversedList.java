package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0013\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;)V", "size", HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "add", HttpUrl.FRAGMENT_ENCODE_SET, "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.w.r0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ReversedList<T> extends AbstractMutableList<T> {

    /* renamed from: f, reason: collision with root package name */
    private final List<T> f22054f;

    public ReversedList(List<T> list) {
        l.f(list, "delegate");
        this.f22054f = list;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int a() {
        return this.f22054f.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, T element) {
        int G;
        List<T> list = this.f22054f;
        G = z.G(this, index);
        list.add(G, element);
    }

    @Override // kotlin.collections.AbstractMutableList
    public T b(int i2) {
        int F;
        List<T> list = this.f22054f;
        F = z.F(this, i2);
        return list.remove(F);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f22054f.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        int F;
        List<T> list = this.f22054f;
        F = z.F(this, index);
        return list.get(F);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int index, T element) {
        int F;
        List<T> list = this.f22054f;
        F = z.F(this, index);
        return list.set(F, element);
    }
}
