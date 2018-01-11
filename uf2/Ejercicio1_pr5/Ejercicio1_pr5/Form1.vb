Module ordenar

    Function ord(ByVal num() As Integer) As Integer
        Dim j, aux As Integer
        Dim i As Integer
        For i = 1 To num.Length
            For j = 0 To num.Length - i - 1
                If num(j) > num(j + 1) Then
                    aux = num(j + 1)
                    num(j + 1) = num(j)
                    num(j) = aux
                End If
            Next
        Next

    End Function

End Module

Module parell

    Function par(ByVal num() As Integer, ByVal i As Integer) As Integer
        Dim j As Integer

        Return 0
    End Function

End Module

Module senars

    Function sen(ByVal num() As Integer, ByVal i As Integer) As Integer
        Return 0
    End Function

End Module

Public Class Form1
    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim num(8), i As Integer
        i = 0

        For i = i To 8
            num(i) = Val(InputBox("introduce numeros", " introduce los numeros"))
        Next

        i = 0
        For i = i To 8
            Me.TextBox1.Text = Me.TextBox1.Text & num(i) & ", "
        Next

        i = 0
        num(i) = ordenar.ord(num)

        For i = i To 8
            Me.TextBox2.Text = Me.TextBox2.Text & num(i) & ", "
        Next

        For i = 1 To 7
            If num(i) Mod 2 = 0 Then
                Me.TextBox3.Text = Me.TextBox3.Text & num(i) & ", "
            End If
        Next

        For i = 1 To 7
            If num(i) Mod 2 <> 0 Then
                Me.TextBox4.Text = Me.TextBox4.Text & num(i) & ", "
            End If
        Next

    End Sub
End Class
