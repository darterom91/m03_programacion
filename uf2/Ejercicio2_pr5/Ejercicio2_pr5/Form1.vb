Public Class Form1

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim palabras(2, 4) As String
        Dim i, j As Integer

        For i = 0 To 1
            For j = 0 To 3
                palabras(i, j) = InputBox("Introduce todas las palabras", "Introduce una palabra")
            Next
        Next
        For i = 0 To 1
            For j = 0 To 3
                Me.TextBox1.Text = Me.TextBox1.Text & palabras(i, j) & vbTab
            Next
            Me.TextBox1.Text = Me.TextBox1.Text & vbCrLf
        Next

    End Sub
End Class
