.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public f1()
		.limit stack 128
		.limit locals 128
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean
		ifeq Label_0
		ldc "1"
		areturn
		goto Label_1
	Label_0:
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc "sss"
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean
		invokevirtual java/lang/Boolean/booleanValue()Z
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Main/f2(Ljava/util/ArrayList;)Ljava/lang/String;
		areturn
	Label_1:
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Main/f3(Ljava/util/ArrayList;)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc "11"
		areturn
.end method
.method public f2(abc)
		.limit stack 128
		.limit locals 128
		ldc "2"
		areturn
.end method
.method public f3()
		.limit stack 128
		.limit locals 128
		ldc "kouroshu"
		astore_0
		new java/lang/StringBuilder
		dup
		aload_0
		invokespecial java/lang/StringBuilder/<init>(Ljava/lang/String;)V
		dup
		invokevirtual java/lang/StringBuilder/length()I
		iconst_1
		isub
		invokevirtual java/lang/StringBuilder/setLength(I)V
		invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
		astore_1
		iload_1
		java/lang/String/length()
		ireturn
.end method
.method public f4(v)
		.limit stack 128
		.limit locals 128
		ireturn
.end method
.method public f5()
		.limit stack 128
		.limit locals 128
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		istore_0
		ldc 7
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		istore_1
		iload_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		iload_1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		iadd
		ireturn
.end method
.method public f6()
		.limit stack 128
		.limit locals 128
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		istore_0
	Label_2:
		iload_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		iconst_1
		iadd
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		iload_0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		if_icmpeq
		ifeq Label_4
		ldc "kourosh"
		getstatic java/lang/System/out Ljava/io/PrintStream;
		swap
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		goto Label_3
		goto Label_5
	Label_4:
		goto Label_2
	Label_5:
		ldc "We Have Reached A = 10"
		getstatic java/lang/System/out Ljava/io/PrintStream;
		swap
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		goto Label_2
	Label_3:
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc 4
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new List
		dup
		swap
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore_2
		iload_2
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual List/getElement(I)Ljava/lang/Object;
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		istore_3
		iload_2
		List/getSize()
		ireturn
.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Main/f1(Ljava/util/ArrayList;)Ljava/lang/String;
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Main/f4(Ljava/util/ArrayList;)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Main/f5(Ljava/util/ArrayList;)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokevirtual Main/f6(Ljava/util/ArrayList;)Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		return
		.end method
