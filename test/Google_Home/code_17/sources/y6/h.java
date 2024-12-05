package y6;

import b6.InterfaceC1985a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class h {

    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private int f41048a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f41049b;

        a(f fVar) {
            this.f41049b = fVar;
            this.f41048a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f41049b;
            int e8 = fVar.e();
            int i8 = this.f41048a;
            this.f41048a = i8 - 1;
            return fVar.h(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41048a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements Iterator, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        private int f41050a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f41051b;

        b(f fVar) {
            this.f41051b = fVar;
            this.f41050a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f41051b;
            int e8 = fVar.e();
            int i8 = this.f41050a;
            this.f41050a = i8 - 1;
            return fVar.f(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f41050a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f41052a;

        public c(f fVar) {
            this.f41052a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f41052a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements Iterable, InterfaceC1985a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f41053a;

        public d(f fVar) {
            this.f41053a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f41053a);
        }
    }

    public static final Iterable a(f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        AbstractC3255y.i(fVar, "<this>");
        return new d(fVar);
    }
}
