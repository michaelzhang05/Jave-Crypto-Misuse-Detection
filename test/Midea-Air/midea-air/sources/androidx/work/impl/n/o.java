package androidx.work.impl.n;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<m> f2014b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.q f2015c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.q f2016d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<m> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, m mVar) {
            String str = mVar.a;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            byte[] l = androidx.work.e.l(mVar.f2013b);
            if (l == null) {
                fVar.a0(2);
            } else {
                fVar.K(2, l);
            }
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.q {
        b(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends androidx.room.q {
        c(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.j jVar) {
        this.a = jVar;
        this.f2014b = new a(jVar);
        this.f2015c = new b(jVar);
        this.f2016d = new c(jVar);
    }

    @Override // androidx.work.impl.n.n
    public void a() {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2016d.acquire();
        this.a.beginTransaction();
        try {
            acquire.p();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f2016d.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.n
    public void b(m mVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2014b.insert((androidx.room.c<m>) mVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.n
    public void delete(String str) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2015c.acquire();
        if (str == null) {
            acquire.a0(1);
        } else {
            acquire.m(1, str);
        }
        this.a.beginTransaction();
        try {
            acquire.p();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f2015c.release(acquire);
        }
    }
}
