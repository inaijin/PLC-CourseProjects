.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		ldc 5
		istore 1
		ldc 2
		istore 2
		iload 1
		iload 2
		iadd
		istore 3
		iload 1
		iload 2
		iadd
		getstatic java/lang/System/out Ljava/io/PrintStream;
		swap
		invokevirtual java/io/PrintStream/println(I)V
		iload 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		swap
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
