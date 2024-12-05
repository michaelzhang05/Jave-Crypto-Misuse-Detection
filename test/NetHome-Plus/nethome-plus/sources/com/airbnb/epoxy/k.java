package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import java.util.Collections;
import java.util.List;

/* compiled from: DiffResult.java */
/* loaded from: classes.dex */
public class k {
    final List<? extends s<?>> a;

    /* renamed from: b, reason: collision with root package name */
    final List<? extends s<?>> f7844b;

    /* renamed from: c, reason: collision with root package name */
    final f.c f7845c;

    private k(List<? extends s<?>> list, List<? extends s<?>> list2, f.c cVar) {
        this.a = list;
        this.f7844b = list2;
        this.f7845c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k a(List<? extends s<?>> list) {
        return new k(list, Collections.EMPTY_LIST, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k b(List<? extends s<?>> list, List<? extends s<?>> list2, f.c cVar) {
        return new k(list, list2, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k e(List<? extends s<?>> list) {
        return new k(Collections.EMPTY_LIST, list, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k f(List<? extends s<?>> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new k(list, list, null);
    }

    public void c(androidx.recyclerview.widget.l lVar) {
        f.c cVar = this.f7845c;
        if (cVar != null) {
            cVar.d(lVar);
            return;
        }
        if (this.f7844b.isEmpty() && !this.a.isEmpty()) {
            lVar.c(0, this.a.size());
        } else {
            if (this.f7844b.isEmpty() || !this.a.isEmpty()) {
                return;
            }
            lVar.b(0, this.f7844b.size());
        }
    }

    public void d(RecyclerView.g gVar) {
        c(new androidx.recyclerview.widget.b(gVar));
    }
}
