package com.facebook.internal.a0.g;

import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.facebook.GraphRequest;
import com.facebook.f;
import com.facebook.i;
import com.facebook.internal.a0.d;
import com.facebook.internal.x;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: ErrorReportHandler.java */
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ErrorReportHandler.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<com.facebook.internal.a0.g.a> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.facebook.internal.a0.g.a aVar, com.facebook.internal.a0.g.a aVar2) {
            return aVar.b(aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ErrorReportHandler.java */
    /* renamed from: com.facebook.internal.a0.g.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0134b implements GraphRequest.f {
        final /* synthetic */ ArrayList a;

        C0134b(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            try {
                if (iVar.g() == null && iVar.h().getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
                    for (int i2 = 0; this.a.size() > i2; i2++) {
                        ((com.facebook.internal.a0.g.a) this.a.get(i2)).a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ErrorReportHandler.java */
    /* loaded from: classes.dex */
    public static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", "error_log_"));
        }
    }

    public static void a() {
        if (f.i()) {
            d();
        }
    }

    public static File[] b() {
        File c2 = d.c();
        return c2 == null ? new File[0] : c2.listFiles(new c());
    }

    public static void c(String str) {
        try {
            new com.facebook.internal.a0.g.a(str).e();
        } catch (Exception unused) {
        }
    }

    public static void d() {
        if (x.O()) {
            return;
        }
        File[] b2 = b();
        ArrayList arrayList = new ArrayList();
        for (File file : b2) {
            com.facebook.internal.a0.g.a aVar = new com.facebook.internal.a0.g.a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        Collections.sort(arrayList, new a());
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        d.i("error_reports", jSONArray, new C0134b(arrayList));
    }
}
