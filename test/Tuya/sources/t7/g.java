package t7;

import t7.o;

/* loaded from: classes5.dex */
final class g extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f38289e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38290f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38291g;

    private g(b bVar) {
        super(bVar);
        this.f38289e = 0;
        this.f38290f = bVar.f38292e;
        this.f38291g = bVar.f38293f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t7.o
    public byte[] d() {
        byte[] d8 = super.d();
        E7.f.d(this.f38289e, d8, 16);
        E7.f.d(this.f38290f, d8, 20);
        E7.f.d(this.f38291g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f38290f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f38291g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f38292e;

        /* renamed from: f, reason: collision with root package name */
        private int f38293f;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(2);
            this.f38292e = 0;
            this.f38293f = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o k() {
            return new g(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b m(int i8) {
            this.f38292e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f38293f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // t7.o.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
