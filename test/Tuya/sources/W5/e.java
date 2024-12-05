package w5;

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
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class e extends Q7.a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f39055o = new a();

    /* renamed from: p, reason: collision with root package name */
    public static final String f39056p = e.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    public C3852b f39057m;

    /* renamed from: n, reason: collision with root package name */
    public C3851a f39058n;

    /* loaded from: classes5.dex */
    public static final class a {
    }

    public static final void k(e this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // Q7.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C3851a c3851a;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            c3851a = null;
        } else {
            c3851a = (C3851a) arguments.getParcelable("partner_disclosure_args");
        }
        if (c3851a == null) {
            c3851a = new C3851a(new ArrayList());
        }
        this.f39058n = c3851a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3159y.h(viewModelStore, "viewModelStore");
            this.f39057m = (C3852b) new ViewModelProvider(viewModelStore, new c()).get(C3852b.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3159y.i(inflater, "inflater");
        View inflate = inflater.inflate(I1.c.f3872j, viewGroup, false);
        AbstractC3159y.h(inflate, "inflater.inflate(R.layou…osures, container, false)");
        return inflate;
    }

    @Override // Q7.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(I1.b.f3773Q);
        C3852b c3852b = null;
        if (recyclerView != null) {
            C3851a c3851a = this.f39058n;
            if (c3851a == null) {
                AbstractC3159y.y("args");
                c3851a = null;
            }
            recyclerView.setAdapter(new Q7.d(c3851a.f39052a));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        TextView textView = this.f8374b;
        if (textView != null) {
            C3852b c3852b2 = this.f39057m;
            if (c3852b2 == null) {
                AbstractC3159y.y("viewModel");
                c3852b2 = null;
            }
            textView.setText(c3852b2.f39053a.f5687a);
        }
        ImageView imageView = this.f8375c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: w5.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    e.k(e.this, view2);
                }
            });
            C3852b c3852b3 = this.f39057m;
            if (c3852b3 == null) {
                AbstractC3159y.y("viewModel");
            } else {
                c3852b = c3852b3;
            }
            imageView.setContentDescription(c3852b.f39053a.f5688b);
        }
        J7.c cVar = this.f8382j;
        if (cVar != null && (num = cVar.f5549g) != null) {
            view.setBackgroundColor(num.intValue());
        }
    }
}
