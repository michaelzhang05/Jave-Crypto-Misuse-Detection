package G4;

import H4.j;
import Z4.InterfaceC1596j;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: G4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1193c extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f3199a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f3200b;

    /* renamed from: c, reason: collision with root package name */
    private int f3201c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1596j f3202d;

    /* renamed from: G4.c$a */
    /* loaded from: classes4.dex */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f3203a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f3204b;

        /* renamed from: c, reason: collision with root package name */
        private final TextView f3205c;

        /* renamed from: d, reason: collision with root package name */
        private final RadioButton f3206d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1193c f3207e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1193c c1193c, View itemView) {
            super(itemView);
            AbstractC3255y.i(itemView, "itemView");
            this.f3207e = c1193c;
            View findViewById = itemView.findViewById(R.id.iv_path);
            AbstractC3255y.h(findViewById, "itemView.findViewById(R.id.iv_path)");
            this.f3203a = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.tv_path_name);
            AbstractC3255y.h(findViewById2, "itemView.findViewById(R.id.tv_path_name)");
            TextView textView = (TextView) findViewById2;
            this.f3204b = textView;
            View findViewById3 = itemView.findViewById(R.id.tv_path_detail);
            AbstractC3255y.h(findViewById3, "itemView.findViewById(R.id.tv_path_detail)");
            TextView textView2 = (TextView) findViewById3;
            this.f3205c = textView2;
            View findViewById4 = itemView.findViewById(R.id.rb_path);
            AbstractC3255y.h(findViewById4, "itemView.findViewById(R.id.rb_path)");
            this.f3206d = (RadioButton) findViewById4;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            textView2.setTypeface(aVar.u());
        }

        public final ImageView a() {
            return this.f3203a;
        }

        public final RadioButton b() {
            return this.f3206d;
        }

        public final TextView c() {
            return this.f3205c;
        }

        public final TextView d() {
            return this.f3204b;
        }
    }

    public C1193c(Context context, ArrayList arrayList, int i8, InterfaceC1596j listener) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f3199a = context;
        this.f3200b = arrayList;
        this.f3201c = i8;
        this.f3202d = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1193c this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f3201c = i8;
        this$0.f3202d.a(i8);
        this$0.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, final int i8) {
        boolean z8 = false;
        AbstractC3255y.i(holder, "holder");
        ArrayList arrayList = this.f3200b;
        AbstractC3255y.f(arrayList);
        if (((N4.e) arrayList.get(i8)).d()) {
            holder.a().setImageResource(R.drawable.vector_more_info_size);
            TextView d8 = holder.d();
            Resources resources = this.f3199a.getResources();
            Q4.g gVar = new Q4.g();
            ArrayList arrayList2 = this.f3200b;
            AbstractC3255y.f(arrayList2);
            d8.setText(resources.getString(R.string.sd_card_free, gVar.c(((N4.e) arrayList2.get(i8)).a())));
        } else {
            holder.a().setImageResource(R.drawable.vector_more_info_requirements);
            TextView d9 = holder.d();
            Resources resources2 = this.f3199a.getResources();
            Q4.g gVar2 = new Q4.g();
            ArrayList arrayList3 = this.f3200b;
            AbstractC3255y.f(arrayList3);
            d9.setText(resources2.getString(R.string.internal_memory_free, gVar2.c(((N4.e) arrayList3.get(i8)).a())));
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: G4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1193c.c(C1193c.this, i8, view);
            }
        });
        TextView c8 = holder.c();
        ArrayList arrayList4 = this.f3200b;
        AbstractC3255y.f(arrayList4);
        c8.setText(((N4.e) arrayList4.get(i8)).b());
        RadioButton b8 = holder.b();
        if (this.f3201c == i8) {
            z8 = true;
        }
        b8.setChecked(z8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3255y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.download_path, parent, false);
        AbstractC3255y.h(itemView, "itemView");
        return new a(this, itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList arrayList = this.f3200b;
        if (arrayList == null) {
            return 0;
        }
        AbstractC3255y.f(arrayList);
        return arrayList.size();
    }
}
