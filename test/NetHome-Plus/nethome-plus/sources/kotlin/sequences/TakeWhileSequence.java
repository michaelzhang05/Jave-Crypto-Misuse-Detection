package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.HttpUrl;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.g0.o, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class TakeWhileSequence<T> implements Sequence<T> {
    private final Sequence<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<T, Boolean> f21553b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", HttpUrl.FRAGMENT_ENCODE_SET, "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", HttpUrl.FRAGMENT_ENCODE_SET, "getNextState", "()I", "setNextState", "(I)V", "calcNext", HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", HttpUrl.FRAGMENT_ENCODE_SET, "next", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.g0.o$a */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, KMappedMarker {

        /* renamed from: f, reason: collision with root package name */
        private final Iterator<T> f21554f;

        /* renamed from: g, reason: collision with root package name */
        private int f21555g = -1;

        /* renamed from: h, reason: collision with root package name */
        private T f21556h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TakeWhileSequence<T> f21557i;

        a(TakeWhileSequence<T> takeWhileSequence) {
            this.f21557i = takeWhileSequence;
            this.f21554f = ((TakeWhileSequence) takeWhileSequence).a.iterator();
        }

        private final void a() {
            if (this.f21554f.hasNext()) {
                T next = this.f21554f.next();
                if (((Boolean) ((TakeWhileSequence) this.f21557i).f21553b.invoke(next)).booleanValue()) {
                    this.f21555g = 1;
                    this.f21556h = next;
                    return;
                }
            }
            this.f21555g = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21555g == -1) {
                a();
            }
            return this.f21555g == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f21555g == -1) {
                a();
            }
            if (this.f21555g != 0) {
                T t = this.f21556h;
                this.f21556h = null;
                this.f21555g = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakeWhileSequence(Sequence<? extends T> sequence, Function1<? super T, Boolean> function1) {
        l.f(sequence, "sequence");
        l.f(function1, "predicate");
        this.a = sequence;
        this.f21553b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new a(this);
    }
}
