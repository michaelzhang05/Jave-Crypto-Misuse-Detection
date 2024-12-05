package a5;

import java.util.List;

/* loaded from: classes.dex */
public abstract class b extends a5.a implements List {

    /* renamed from: a, reason: collision with root package name */
    public static final a f69a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f5.f fVar) {
            this();
        }

        public final void a(int i6, int i7) {
            if (i6 < 0 || i6 >= i7) {
                throw new IndexOutOfBoundsException("index: " + i6 + ", size: " + i7);
            }
        }

        public final void b(int i6, int i7) {
            if (i6 < 0 || i6 > i7) {
                throw new IndexOutOfBoundsException("index: " + i6 + ", size: " + i7);
            }
        }
    }
}
