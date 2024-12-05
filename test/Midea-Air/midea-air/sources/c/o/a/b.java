package c.o.a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Palette.java */
/* loaded from: classes.dex */
public final class b {
    static final c a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final List<e> f2849b;

    /* renamed from: c, reason: collision with root package name */
    private final List<c.o.a.c> f2850c;

    /* renamed from: e, reason: collision with root package name */
    private final SparseBooleanArray f2852e = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private final Map<c.o.a.c, e> f2851d = new c.e.a();

    /* renamed from: f, reason: collision with root package name */
    private final e f2853f = a();

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean c(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // c.o.a.b.c
        public boolean a(int i2, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: c.o.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0076b {
        private final List<e> a;

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f2854b;

        /* renamed from: c, reason: collision with root package name */
        private final List<c.o.a.c> f2855c;

        /* renamed from: d, reason: collision with root package name */
        private int f2856d;

        /* renamed from: e, reason: collision with root package name */
        private int f2857e;

        /* renamed from: f, reason: collision with root package name */
        private int f2858f;

        /* renamed from: g, reason: collision with root package name */
        private final List<c> f2859g;

        /* renamed from: h, reason: collision with root package name */
        private Rect f2860h;

        /* compiled from: Palette.java */
        /* renamed from: c.o.a.b$b$a */
        /* loaded from: classes.dex */
        class a extends AsyncTask<Bitmap, Void, b> {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C0076b.this.b();
                } catch (Exception e2) {
                    Log.e("Palette", "Exception thrown during async generate", e2);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(b bVar) {
                this.a.a(bVar);
            }
        }

        public C0076b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f2855c = arrayList;
            this.f2856d = 16;
            this.f2857e = 12544;
            this.f2858f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f2859g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(b.a);
                this.f2854b = bitmap;
                this.a = null;
                arrayList.add(c.o.a.c.a);
                arrayList.add(c.o.a.c.f2870b);
                arrayList.add(c.o.a.c.f2871c);
                arrayList.add(c.o.a.c.f2872d);
                arrayList.add(c.o.a.c.f2873e);
                arrayList.add(c.o.a.c.f2874f);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        private int[] c(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f2860h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f2860h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i2 = 0; i2 < height2; i2++) {
                Rect rect2 = this.f2860h;
                System.arraycopy(iArr, ((rect2.top + i2) * width) + rect2.left, iArr2, i2 * width2, width2);
            }
            return iArr2;
        }

        private Bitmap e(Bitmap bitmap) {
            int max;
            int i2;
            double d2 = -1.0d;
            if (this.f2857e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i3 = this.f2857e;
                if (width > i3) {
                    double d3 = i3;
                    double d4 = width;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    d2 = Math.sqrt(d3 / d4);
                }
            } else if (this.f2858f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i2 = this.f2858f)) {
                double d5 = i2;
                double d6 = max;
                Double.isNaN(d5);
                Double.isNaN(d6);
                d2 = d5 / d6;
            }
            if (d2 <= 0.0d) {
                return bitmap;
            }
            double width2 = bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d2);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d2), false);
        }

        public AsyncTask<Bitmap, Void, b> a(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f2854b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public b b() {
            List<e> list;
            c[] cVarArr;
            Bitmap bitmap = this.f2854b;
            if (bitmap != null) {
                Bitmap e2 = e(bitmap);
                Rect rect = this.f2860h;
                if (e2 != this.f2854b && rect != null) {
                    double width = e2.getWidth();
                    double width2 = this.f2854b.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width2);
                    double d2 = width / width2;
                    double d3 = rect.left;
                    Double.isNaN(d3);
                    rect.left = (int) Math.floor(d3 * d2);
                    double d4 = rect.top;
                    Double.isNaN(d4);
                    rect.top = (int) Math.floor(d4 * d2);
                    double d5 = rect.right;
                    Double.isNaN(d5);
                    rect.right = Math.min((int) Math.ceil(d5 * d2), e2.getWidth());
                    double d6 = rect.bottom;
                    Double.isNaN(d6);
                    rect.bottom = Math.min((int) Math.ceil(d6 * d2), e2.getHeight());
                }
                int[] c2 = c(e2);
                int i2 = this.f2856d;
                if (this.f2859g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.f2859g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                c.o.a.a aVar = new c.o.a.a(c2, i2, cVarArr);
                if (e2 != this.f2854b) {
                    e2.recycle();
                }
                list = aVar.d();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(list, this.f2855c);
            bVar.c();
            return bVar;
        }

        public C0076b d(int i2) {
            this.f2856d = i2;
            return this;
        }
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(int i2, float[] fArr);
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(b bVar);
    }

    /* compiled from: Palette.java */
    /* loaded from: classes.dex */
    public static final class e {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2862b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2863c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2864d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2865e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2866f;

        /* renamed from: g, reason: collision with root package name */
        private int f2867g;

        /* renamed from: h, reason: collision with root package name */
        private int f2868h;

        /* renamed from: i, reason: collision with root package name */
        private float[] f2869i;

        public e(int i2, int i3) {
            this.a = Color.red(i2);
            this.f2862b = Color.green(i2);
            this.f2863c = Color.blue(i2);
            this.f2864d = i2;
            this.f2865e = i3;
        }

        private void a() {
            int o;
            int o2;
            if (this.f2866f) {
                return;
            }
            int f2 = c.h.e.a.f(-1, this.f2864d, 4.5f);
            int f3 = c.h.e.a.f(-1, this.f2864d, 3.0f);
            if (f2 != -1 && f3 != -1) {
                this.f2868h = c.h.e.a.o(-1, f2);
                this.f2867g = c.h.e.a.o(-1, f3);
                this.f2866f = true;
                return;
            }
            int f4 = c.h.e.a.f(-16777216, this.f2864d, 4.5f);
            int f5 = c.h.e.a.f(-16777216, this.f2864d, 3.0f);
            if (f4 != -1 && f5 != -1) {
                this.f2868h = c.h.e.a.o(-16777216, f4);
                this.f2867g = c.h.e.a.o(-16777216, f5);
                this.f2866f = true;
                return;
            }
            if (f2 != -1) {
                o = c.h.e.a.o(-1, f2);
            } else {
                o = c.h.e.a.o(-16777216, f4);
            }
            this.f2868h = o;
            if (f3 != -1) {
                o2 = c.h.e.a.o(-1, f3);
            } else {
                o2 = c.h.e.a.o(-16777216, f5);
            }
            this.f2867g = o2;
            this.f2866f = true;
        }

        public int b() {
            a();
            return this.f2868h;
        }

        public float[] c() {
            if (this.f2869i == null) {
                this.f2869i = new float[3];
            }
            c.h.e.a.b(this.a, this.f2862b, this.f2863c, this.f2869i);
            return this.f2869i;
        }

        public int d() {
            return this.f2865e;
        }

        public int e() {
            return this.f2864d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f2865e == eVar.f2865e && this.f2864d == eVar.f2864d;
        }

        public int f() {
            a();
            return this.f2867g;
        }

        public int hashCode() {
            return (this.f2864d * 31) + this.f2865e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f2865e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    b(List<e> list, List<c.o.a.c> list2) {
        this.f2849b = list;
        this.f2850c = list2;
    }

    private e a() {
        int size = this.f2849b.size();
        int i2 = Integer.MIN_VALUE;
        e eVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            e eVar2 = this.f2849b.get(i3);
            if (eVar2.d() > i2) {
                i2 = eVar2.d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public static C0076b b(Bitmap bitmap) {
        return new C0076b(bitmap);
    }

    private float d(e eVar, c.o.a.c cVar) {
        float[] c2 = eVar.c();
        e eVar2 = this.f2853f;
        return (cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(c2[1] - cVar.i())) : 0.0f) + (cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(c2[2] - cVar.h())) : 0.0f) + (cVar.f() > 0.0f ? cVar.f() * (eVar.d() / (eVar2 != null ? eVar2.d() : 1)) : 0.0f);
    }

    private e e(c.o.a.c cVar) {
        e g2 = g(cVar);
        if (g2 != null && cVar.j()) {
            this.f2852e.append(g2.e(), true);
        }
        return g2;
    }

    private e g(c.o.a.c cVar) {
        int size = this.f2849b.size();
        float f2 = 0.0f;
        e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = this.f2849b.get(i2);
            if (h(eVar2, cVar)) {
                float d2 = d(eVar2, cVar);
                if (eVar == null || d2 > f2) {
                    eVar = eVar2;
                    f2 = d2;
                }
            }
        }
        return eVar;
    }

    private boolean h(e eVar, c.o.a.c cVar) {
        float[] c2 = eVar.c();
        return c2[1] >= cVar.e() && c2[1] <= cVar.c() && c2[2] >= cVar.d() && c2[2] <= cVar.b() && !this.f2852e.get(eVar.e());
    }

    void c() {
        int size = this.f2850c.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.o.a.c cVar = this.f2850c.get(i2);
            cVar.k();
            this.f2851d.put(cVar, e(cVar));
        }
        this.f2852e.clear();
    }

    public int f(int i2) {
        e eVar = this.f2853f;
        return eVar != null ? eVar.e() : i2;
    }
}
