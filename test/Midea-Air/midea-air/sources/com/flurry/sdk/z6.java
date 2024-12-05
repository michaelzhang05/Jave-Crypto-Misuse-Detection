package com.flurry.sdk;

import com.flurry.sdk.i2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class z6 extends l2 implements y6 {
    public a7 o;
    public v6 p;

    /* loaded from: classes2.dex */
    public class a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ y6 f10278h;

        public a(y6 y6Var) {
            this.f10278h = y6Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            z6.this.o = new a7(q2.c(), this.f10278h);
            z6.this.o.startWatching();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class b extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f10280h;

        b(List list) {
            this.f10280h = list;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            d1.c(2, "VNodeFileProcessor", "Number of files already pending: in VNodeListener " + this.f10280h.size());
            ArrayList arrayList = new ArrayList();
            for (File file : this.f10280h) {
                if (file.exists()) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
            if (z6.this.p != null) {
                z6.this.p.e(arrayList);
            }
        }
    }

    public z6(v6 v6Var) {
        super("VNodeFileProcessor", i2.a(i2.b.DATA_PROCESSOR));
        this.o = null;
        this.p = v6Var;
    }

    public final void e(List<File> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        m(new b(list));
    }

    @Override // com.flurry.sdk.y6
    public final void h(String str) {
        File file = new File(q2.c() + File.separator + str);
        if (file.exists()) {
            e(Arrays.asList(file));
        }
    }
}
