package V5;

import f6.InterfaceC2680g;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h implements InterfaceC2680g {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f11933a;

    /* loaded from: classes5.dex */
    public static final class a implements Iterator, Y5.a {

        /* renamed from: a, reason: collision with root package name */
        private String f11934a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f11935b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f11934a;
                this.f11934a = null;
                AbstractC3159y.f(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11934a == null && !this.f11935b) {
                String readLine = h.this.f11933a.readLine();
                this.f11934a = readLine;
                if (readLine == null) {
                    this.f11935b = true;
                }
            }
            if (this.f11934a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(BufferedReader reader) {
        AbstractC3159y.i(reader, "reader");
        this.f11933a = reader;
    }

    @Override // f6.InterfaceC2680g
    public Iterator iterator() {
        return new a();
    }
}
