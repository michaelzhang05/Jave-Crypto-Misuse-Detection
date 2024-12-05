package v6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class h {

    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private int f38917a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f38918b;

        a(f fVar) {
            this.f38918b = fVar;
            this.f38917a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f38918b;
            int e8 = fVar.e();
            int i8 = this.f38917a;
            this.f38917a = i8 - 1;
            return fVar.h(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38917a > 0) {
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
    public static final class b implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private int f38919a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f38920b;

        b(f fVar) {
            this.f38920b = fVar;
            this.f38919a = fVar.e();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f38920b;
            int e8 = fVar.e();
            int i8 = this.f38919a;
            this.f38919a = i8 - 1;
            return fVar.f(e8 - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f38919a > 0) {
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
    public static final class c implements Iterable, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f38921a;

        public c(f fVar) {
            this.f38921a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f38921a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements Iterable, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f38922a;

        public d(f fVar) {
            this.f38922a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f38922a);
        }
    }

    public static final Iterable a(f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable b(f fVar) {
        AbstractC3159y.i(fVar, "<this>");
        return new d(fVar);
    }
}
