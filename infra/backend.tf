terraform {
  backend "s3" {
    bucket         = "arn:aws:s3:::urpdrum-us-east-1-terraform-action"  # Mantenha o ARN do seu bucket
    key            = "terraform/state/dev.tfstate"  # Ajuste o caminho
    region         = "us-east-1"  # **ADICIONE ISSO!**
    encrypt        = true
    dynamodb_table = "terraform-locks"  # Ajuste se estiver usando
  }
}