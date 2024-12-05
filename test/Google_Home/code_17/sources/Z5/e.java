package z5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class e extends T7.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f41178o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final String f41179p = e.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    public C4232b f41180m;

    /* renamed from: n, reason: collision with root package name */
    public C4231a f41181n;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(e this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // T7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C4231a c4231a;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            c4231a = null;
        } else {
            c4231a = (C4231a) arguments.getParcelable("partner_disclosure_args");
        }
        if (c4231a == null) {
            c4231a = new C4231a(new ArrayList());
        }
        this.f41181n = c4231a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3255y.h(viewModelStore, "viewModelStore");
            this.f41180m = (C4232b) new ViewModelProvider(viewModelStore, new c()).get(C4232b.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3255y.i(inflater, "inflater");
        View inflate = inflater.inflate(L1.c.f5867j, viewGroup, false);
        AbstractC3255y.h(inflate, "inflater.inflate(R.layou…osures, container, false)");
        return inflate;
    }

    @Override // T7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(L1.b.f5768Q);
        C4232b c4232b = null;
        if (recyclerView != null) {
            C4231a c4231a = this.f41181n;
            if (c4231a == null) {
                AbstractC3255y.y("args");
                c4231a = null;
            }
            recyclerView.setAdapter(new T7.d(c4231a.f41175a));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        TextView textView = this.f10171b;
        if (textView != null) {
            C4232b c4232b2 = this.f41180m;
            if (c4232b2 == null) {
                AbstractC3255y.y("viewModel");
                c4232b2 = null;
            }
            textView.setText(c4232b2.f41176a.f7393a);
        }
        ImageView imageView = this.f10172c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: z5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    e.k(e.this, view2);
                }
            });
            C4232b c4232b3 = this.f41180m;
            if (c4232b3 == null) {
                AbstractC3255y.y("viewModel");
            } else {
                c4232b = c4232b3;
            }
            imageView.setContentDescription(c4232b.f41176a.f7394b);
        }
        M7.c cVar = this.f10179j;
        if (cVar != null && (num = cVar.f7255g) != null) {
            view.setBackgroundColor(num.intValue());
        }
    }
}
