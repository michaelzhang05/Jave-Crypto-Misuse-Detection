package o;

import androidx.appcompat.widget.SearchView;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3501k implements SearchView.OnQueryTextListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3500j f35764a;

    public C3501k(C3500j c3500j) {
        this.f35764a = c3500j;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String newText) {
        boolean z8;
        AbstractC3255y.i(newText, "newText");
        U7.a aVar = this.f35764a.f35763s;
        C3503m c3503m = null;
        if (aVar == null) {
            AbstractC3255y.y("switchAdapter");
            aVar = null;
        }
        C3503m c3503m2 = this.f35764a.f35761q;
        if (c3503m2 == null) {
            AbstractC3255y.y("viewModel");
        } else {
            c3503m = c3503m2;
        }
        List b8 = c3503m.b(newText);
        if (newText.length() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.b(b8, z8);
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }
}
