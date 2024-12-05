package D4;

import D4.N;
import T4.v0;
import T4.w0;
import W4.InterfaceC1483f;
import X4.C1499i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class N extends RecyclerView.Adapter {

    /* renamed from: g, reason: collision with root package name */
    public static final a f1587g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f1588a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1483f f1589b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1590c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1591d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1592e;

    /* renamed from: f, reason: collision with root package name */
    private int f1593f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private w0 f1594a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1483f f1595b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f1596c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f1597d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(N n8, w0 binding, InterfaceC1483f listener, Context context) {
            super(binding.getRoot());
            AbstractC3159y.i(binding, "binding");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(context, "context");
            this.f1597d = n8;
            this.f1594a = binding;
            this.f1595b = listener;
            this.f1596c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b this$0, C1499i avatar, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(avatar, "$avatar");
            this$0.f1595b.a(avatar, i8);
        }

        public final void b(final C1499i avatar, final int i8, boolean z8) {
            AbstractC3159y.i(avatar, "avatar");
            com.squareup.picasso.s.h().l(avatar.c()).n(UptodownApp.f28003B.f0(this.f1596c)).l(R.drawable.shape_avatar_item).i(this.f1594a.f10954b);
            this.f1594a.f10954b.setOnClickListener(new View.OnClickListener() { // from class: D4.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    N.b.c(N.b.this, avatar, i8, view);
                }
            });
            if (z8) {
                this.f1594a.f10956d.setBackground(ContextCompat.getDrawable(this.f1596c, R.drawable.shape_avatar_selected_turbo_item));
            } else {
                this.f1594a.f10956d.setBackground(null);
            }
            if (this.f1597d.f1592e) {
                this.f1594a.f10955c.setVisibility(8);
            } else {
                this.f1594a.f10955c.setVisibility(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private v0 f1598a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1483f f1599b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f1600c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ N f1601d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(N n8, v0 binding, InterfaceC1483f listener, Context context) {
            super(binding.getRoot());
            AbstractC3159y.i(binding, "binding");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(context, "context");
            this.f1601d = n8;
            this.f1598a = binding;
            this.f1599b = listener;
            this.f1600c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, C1499i avatar, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(avatar, "$avatar");
            this$0.f1599b.a(avatar, i8);
        }

        public final void b(final C1499i avatar, final int i8, int i9, boolean z8) {
            AbstractC3159y.i(avatar, "avatar");
            com.squareup.picasso.s.h().l(avatar.c()).n(UptodownApp.f28003B.f0(this.f1600c)).l(R.drawable.shape_avatar_item).i(this.f1598a.f10940b);
            this.f1598a.f10940b.setOnClickListener(new View.OnClickListener() { // from class: D4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    N.c.c(N.c.this, avatar, i8, view);
                }
            });
            this.f1598a.getRoot().setLayoutParams(new RelativeLayout.LayoutParams(i9, i9));
            if (z8) {
                this.f1598a.f10941c.setBackground(ContextCompat.getDrawable(this.f1600c, R.drawable.shape_avatar_selected_item));
            } else {
                this.f1598a.f10941c.setBackground(ContextCompat.getDrawable(this.f1600c, R.drawable.shape_avatar_item));
            }
        }
    }

    public /* synthetic */ N(ArrayList arrayList, InterfaceC1483f interfaceC1483f, int i8, int i9, boolean z8, int i10, AbstractC3151p abstractC3151p) {
        this(arrayList, interfaceC1483f, i8, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? false : z8);
    }

    public final ArrayList b() {
        return this.f1588a;
    }

    public final int c() {
        return this.f1593f;
    }

    public final void d(int i8) {
        this.f1593f = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1588a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        Object obj = this.f1588a.get(i8);
        AbstractC3159y.h(obj, "avatars[pos]");
        C1499i c1499i = (C1499i) obj;
        if (viewHolder instanceof c) {
            if (this.f1593f == i8) {
                ((c) viewHolder).b(c1499i, i8, this.f1591d, true);
                return;
            } else {
                ((c) viewHolder).b(c1499i, i8, this.f1591d, false);
                return;
            }
        }
        if (viewHolder instanceof b) {
            if (this.f1593f == i8) {
                ((b) viewHolder).b(c1499i, i8, true);
            } else {
                ((b) viewHolder).b(c1499i, i8, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        int i9 = this.f1590c;
        if (i9 != 0) {
            if (i9 == 1) {
                w0 c8 = w0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC3159y.h(c8, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
                InterfaceC1483f interfaceC1483f = this.f1589b;
                Context context = viewGroup.getContext();
                AbstractC3159y.h(context, "viewGroup.context");
                return new b(this, c8, interfaceC1483f, context);
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
        v0 c9 = v0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC3159y.h(c9, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        InterfaceC1483f interfaceC1483f2 = this.f1589b;
        Context context2 = viewGroup.getContext();
        AbstractC3159y.h(context2, "viewGroup.context");
        return new c(this, c9, interfaceC1483f2, context2);
    }

    public N(ArrayList avatars, InterfaceC1483f listener, int i8, int i9, boolean z8) {
        AbstractC3159y.i(avatars, "avatars");
        AbstractC3159y.i(listener, "listener");
        this.f1588a = avatars;
        this.f1589b = listener;
        this.f1590c = i8;
        this.f1591d = i9;
        this.f1592e = z8;
        this.f1593f = -1;
    }
}
