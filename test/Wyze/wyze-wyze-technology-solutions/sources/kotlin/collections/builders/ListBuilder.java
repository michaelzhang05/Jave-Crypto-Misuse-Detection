package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.j;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;
import okhttp3.HttpUrl;

/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001VB\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBM\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J&\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010&\u001a\u00020\nH\u0002J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0016J\u0014\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0013\u00101\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u000102H\u0096\u0002J\u0016\u00103\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\nH\u0016J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\u0011H\u0016J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0096\u0002J\u0015\u0010<\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0015\u0010?\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010@\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0002\u00104J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0002\u00104J\u0018\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\nH\u0002J\u0016\u0010F\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J.\u0010G\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010H\u001a\u00020\u0011H\u0002J\u001e\u0010I\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016J\u0015\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\rH\u0016¢\u0006\u0002\u0010OJ'\u0010N\u001a\b\u0012\u0004\u0012\u0002HP0\r\"\u0004\b\u0001\u0010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002HP0\rH\u0016¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u000202H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006W"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "array", HttpUrl.FRAGMENT_ENCODE_SET, "offset", "length", "isReadOnly", HttpUrl.FRAGMENT_ENCODE_SET, "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isEffectivelyReadOnly", "()Z", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "index", "(ILjava/lang/Object;)V", "addAll", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "addAllInternal", "i", "n", "addAtInternal", "build", HttpUrl.FRAGMENT_ENCODE_SET, "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "lastIndexOf", "listIterator", HttpUrl.FRAGMENT_ENCODE_SET, "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.w.x0.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

    /* renamed from: f, reason: collision with root package name */
    private E[] f22060f;

    /* renamed from: g, reason: collision with root package name */
    private int f22061g;

    /* renamed from: h, reason: collision with root package name */
    private int f22062h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22063i;

    /* renamed from: j, reason: collision with root package name */
    private final ListBuilder<E> f22064j;

    /* renamed from: k, reason: collision with root package name */
    private final ListBuilder<E> f22065k;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "list", "Lkotlin/collections/builders/ListBuilder;", "index", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "add", HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Object;)V", "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.w.x0.b$a */
    /* loaded from: classes2.dex */
    private static final class a<E> implements ListIterator<E>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private final ListBuilder<E> f22066f;

        /* renamed from: g, reason: collision with root package name */
        private int f22067g;

        /* renamed from: h, reason: collision with root package name */
        private int f22068h;

        public a(ListBuilder<E> listBuilder, int i2) {
            l.f(listBuilder, "list");
            this.f22066f = listBuilder;
            this.f22067g = i2;
            this.f22068h = -1;
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            ListBuilder<E> listBuilder = this.f22066f;
            int i2 = this.f22067g;
            this.f22067g = i2 + 1;
            listBuilder.add(i2, element);
            this.f22068h = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f22067g < ((ListBuilder) this.f22066f).f22062h;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f22067g > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f22067g < ((ListBuilder) this.f22066f).f22062h) {
                int i2 = this.f22067g;
                this.f22067g = i2 + 1;
                this.f22068h = i2;
                return (E) ((ListBuilder) this.f22066f).f22060f[((ListBuilder) this.f22066f).f22061g + this.f22068h];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f22067g;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i2 = this.f22067g;
            if (i2 > 0) {
                int i3 = i2 - 1;
                this.f22067g = i3;
                this.f22068h = i3;
                return (E) ((ListBuilder) this.f22066f).f22060f[((ListBuilder) this.f22066f).f22061g + this.f22068h];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f22067g - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i2 = this.f22068h;
            if (i2 != -1) {
                this.f22066f.remove(i2);
                this.f22067g = this.f22068h;
                this.f22068h = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            int i2 = this.f22068h;
            if (i2 != -1) {
                this.f22066f.set(i2, element);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private ListBuilder(E[] eArr, int i2, int i3, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f22060f = eArr;
        this.f22061g = i2;
        this.f22062h = i3;
        this.f22063i = z;
        this.f22064j = listBuilder;
        this.f22065k = listBuilder2;
    }

    private final void D(int i2, Collection<? extends E> collection, int i3) {
        ListBuilder<E> listBuilder = this.f22064j;
        if (listBuilder != null) {
            listBuilder.D(i2, collection, i3);
            this.f22060f = this.f22064j.f22060f;
            this.f22062h += i3;
        } else {
            P(i2, i3);
            Iterator<? extends E> it = collection.iterator();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f22060f[i2 + i4] = it.next();
            }
        }
    }

    private final void J(int i2, E e2) {
        ListBuilder<E> listBuilder = this.f22064j;
        if (listBuilder != null) {
            listBuilder.J(i2, e2);
            this.f22060f = this.f22064j.f22060f;
            this.f22062h++;
        } else {
            P(i2, 1);
            this.f22060f[i2] = e2;
        }
    }

    private final void L() {
        if (Q()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean M(List<?> list) {
        boolean h2;
        h2 = c.h(this.f22060f, this.f22061g, this.f22062h, list);
        return h2;
    }

    private final void N(int i2) {
        if (this.f22064j != null) {
            throw new IllegalStateException();
        }
        if (i2 >= 0) {
            E[] eArr = this.f22060f;
            if (i2 > eArr.length) {
                this.f22060f = (E[]) c.e(this.f22060f, ArrayDeque.f22046f.a(eArr.length, i2));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void O(int i2) {
        N(this.f22062h + i2);
    }

    private final void P(int i2, int i3) {
        O(i3);
        E[] eArr = this.f22060f;
        j.e(eArr, eArr, i2 + i3, i2, this.f22061g + this.f22062h);
        this.f22062h += i3;
    }

    private final boolean Q() {
        ListBuilder<E> listBuilder;
        return this.f22063i || ((listBuilder = this.f22065k) != null && listBuilder.f22063i);
    }

    private final E R(int i2) {
        ListBuilder<E> listBuilder = this.f22064j;
        if (listBuilder != null) {
            this.f22062h--;
            return listBuilder.R(i2);
        }
        E[] eArr = this.f22060f;
        E e2 = eArr[i2];
        j.e(eArr, eArr, i2, i2 + 1, this.f22061g + this.f22062h);
        c.f(this.f22060f, (this.f22061g + this.f22062h) - 1);
        this.f22062h--;
        return e2;
    }

    private final void S(int i2, int i3) {
        ListBuilder<E> listBuilder = this.f22064j;
        if (listBuilder != null) {
            listBuilder.S(i2, i3);
        } else {
            E[] eArr = this.f22060f;
            j.e(eArr, eArr, i2, i2 + i3, this.f22062h);
            E[] eArr2 = this.f22060f;
            int i4 = this.f22062h;
            c.g(eArr2, i4 - i3, i4);
        }
        this.f22062h -= i3;
    }

    private final int T(int i2, int i3, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.f22064j;
        if (listBuilder != null) {
            int T = listBuilder.T(i2, i3, collection, z);
            this.f22062h -= T;
            return T;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f22060f[i6]) == z) {
                E[] eArr = this.f22060f;
                i4++;
                eArr[i5 + i2] = eArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        E[] eArr2 = this.f22060f;
        j.e(eArr2, eArr2, i2 + i5, i3 + i2, this.f22062h);
        E[] eArr3 = this.f22060f;
        int i8 = this.f22062h;
        c.g(eArr3, i8 - i7, i8);
        this.f22062h -= i7;
        return i7;
    }

    private final Object writeReplace() {
        if (Q()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final List<E> K() {
        if (this.f22064j == null) {
            L();
            this.f22063i = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a, reason: from getter */
    public int getF22062h() {
        return this.f22062h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        L();
        J(this.f22061g + this.f22062h, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        l.f(elements, "elements");
        L();
        int size = elements.size();
        D(this.f22061g + this.f22062h, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E b(int i2) {
        L();
        AbstractList.f22031f.a(i2, this.f22062h);
        return R(this.f22061g + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        L();
        S(this.f22061g, this.f22062h);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        return other == this || ((other instanceof List) && M((List) other));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.f22031f.a(index, this.f22062h);
        return this.f22060f[this.f22061g + index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2;
        i2 = c.i(this.f22060f, this.f22061g, this.f22062h);
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i2 = 0; i2 < this.f22062h; i2++) {
            if (l.a(this.f22060f[this.f22061g + i2], element)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f22062h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i2 = this.f22062h - 1; i2 >= 0; i2--) {
            if (l.a(this.f22060f[this.f22061g + i2], element)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        L();
        int indexOf = indexOf(element);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        L();
        return T(this.f22061g, this.f22062h, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        l.f(elements, "elements");
        L();
        return T(this.f22061g, this.f22062h, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        L();
        AbstractList.f22031f.a(index, this.f22062h);
        E[] eArr = this.f22060f;
        int i2 = this.f22061g;
        E e2 = eArr[i2 + index];
        eArr[i2 + index] = element;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractList.f22031f.c(fromIndex, toIndex, this.f22062h);
        E[] eArr = this.f22060f;
        int i2 = this.f22061g + fromIndex;
        int i3 = toIndex - fromIndex;
        boolean z = this.f22063i;
        ListBuilder<E> listBuilder = this.f22065k;
        return new ListBuilder(eArr, i2, i3, z, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        l.f(destination, "destination");
        int length = destination.length;
        int i2 = this.f22062h;
        if (length < i2) {
            E[] eArr = this.f22060f;
            int i3 = this.f22061g;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i3, i2 + i3, destination.getClass());
            l.e(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f22060f;
        l.d(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i4 = this.f22061g;
        j.e(eArr2, destination, 0, i4, this.f22062h + i4);
        int length2 = destination.length;
        int i5 = this.f22062h;
        if (length2 > i5) {
            destination[i5] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j2;
        j2 = c.j(this.f22060f, this.f22061g, this.f22062h);
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        AbstractList.f22031f.b(index, this.f22062h);
        return new a(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        L();
        AbstractList.f22031f.b(index, this.f22062h);
        J(this.f22061g + index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        l.f(elements, "elements");
        L();
        AbstractList.f22031f.b(index, this.f22062h);
        int size = elements.size();
        D(this.f22061g + index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.f22060f;
        int i2 = this.f22061g;
        Object[] i3 = j.i(eArr, i2, this.f22062h + i2);
        l.d(i3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return i3;
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i2) {
        this(c.d(i2), 0, 0, false, null, null);
    }
}
