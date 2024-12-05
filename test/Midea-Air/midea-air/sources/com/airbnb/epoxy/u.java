package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* compiled from: EpoxyViewHolder.java */
/* loaded from: classes.dex */
public class u extends RecyclerView.c0 {
    private s a;

    /* renamed from: b, reason: collision with root package name */
    private List<Object> f7882b;

    /* renamed from: c, reason: collision with root package name */
    private q f7883c;

    /* renamed from: d, reason: collision with root package name */
    ViewHolderState.ViewState f7884d;

    public u(View view, boolean z) {
        super(view);
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.f7884d = viewState;
            viewState.c(this.itemView);
        }
    }

    private void a() {
        if (this.a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(s sVar, s<?> sVar2, List<Object> list, int i2) {
        this.f7882b = list;
        if (this.f7883c == null && (sVar instanceof t)) {
            q createNewHolder = ((t) sVar).createNewHolder();
            this.f7883c = createNewHolder;
            createNewHolder.bindView(this.itemView);
        }
        boolean z = sVar instanceof v;
        if (z) {
            ((v) sVar).handlePreBind(this, d(), i2);
        }
        if (sVar2 != null) {
            sVar.bind((s) d(), sVar2);
        } else if (list.isEmpty()) {
            sVar.bind(d());
        } else {
            sVar.bind((s) d(), list);
        }
        if (z) {
            ((v) sVar).handlePostBind(d(), i2);
        }
        this.a = sVar;
    }

    public s<?> c() {
        a();
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d() {
        q qVar = this.f7883c;
        return qVar != null ? qVar : this.itemView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        ViewHolderState.ViewState viewState = this.f7884d;
        if (viewState != null) {
            viewState.b(this.itemView);
        }
    }

    public void f() {
        a();
        this.a.unbind(d());
        this.a = null;
        this.f7882b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.c0
    public String toString() {
        return "EpoxyViewHolder{epoxyModel=" + this.a + ", view=" + this.itemView + ", super=" + super.toString() + '}';
    }
}
