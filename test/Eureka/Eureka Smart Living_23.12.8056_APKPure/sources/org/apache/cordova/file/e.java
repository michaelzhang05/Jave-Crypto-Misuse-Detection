package org.apache.cordova.file;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private int f8537a = 0;

    /* renamed from: b, reason: collision with root package name */
    private SparseArray f8538b = new SparseArray();

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private int f8539a;

        /* renamed from: b, reason: collision with root package name */
        private int f8540b;

        /* renamed from: c, reason: collision with root package name */
        private String f8541c;

        /* renamed from: d, reason: collision with root package name */
        private org.apache.cordova.a f8542d;

        private a(String str, int i6, org.apache.cordova.a aVar) {
            this.f8541c = str;
            this.f8540b = i6;
            this.f8542d = aVar;
            int i7 = e.this.f8537a;
            e.this.f8537a = i7 + 1;
            this.f8539a = i7;
        }

        public int b() {
            return this.f8540b;
        }

        public org.apache.cordova.a c() {
            return this.f8542d;
        }

        public String d() {
            return this.f8541c;
        }
    }

    public synchronized int c(String str, int i6, org.apache.cordova.a aVar) {
        a aVar2;
        aVar2 = new a(str, i6, aVar);
        this.f8538b.put(aVar2.f8539a, aVar2);
        return aVar2.f8539a;
    }

    public synchronized a d(int i6) {
        a aVar;
        aVar = (a) this.f8538b.get(i6);
        this.f8538b.remove(i6);
        return aVar;
    }
}
